import java.io.FileReader;

public class CSVFile {

        public static void main (String[] args){
            CSVReader reader = null;
            try
            {
                reader = new CSVReader(new FileReader("C:\\CsvFile\\Information.csv"));
                String [] nextLine;

                while (null != (nextLine = reader.readNext()))
                {
                    for(String token : nextLine)
                    {
                        System.out.println(token);
                    }
                    System.out.print("\n");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

