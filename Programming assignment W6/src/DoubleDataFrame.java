import java.util.List;
import java.util.Map;

public class DoubleDataFrame implements DataFrame <Double>
{

    List<Map<String,Double>> data;
    List<String> colNames;
    double [][] dataFrame;

    public DoubleDataFrame(List <String> columnNames, double [][] data) {
        this.data = <columnNames,data>;
        this.colNames = columnNames;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {

            }
        }
    }

    public int getRowCount () {
        return this.dataFrame.length;
    }
    public int getColumnCount () {
        return
    }

    public List <String> getColumnNames () {

    }

    public  void  setValue(int  rowIndex , String  colName , E value);
    public E getValue(int  rowIndex , String  colName);


}