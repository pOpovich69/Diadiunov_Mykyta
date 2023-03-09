package Task02;

import Task02.Interfaces.IData;

import java.io.Serializable;
import java.util.ArrayList;

public class History implements Serializable {
    public ArrayList<IData> dataHistory;

    public History() {
        dataHistory = new ArrayList<IData>();
    }
    public void ShowLastDataInHistory(){
            dataHistory.get(dataHistory.size()-1).ShowInfo();
            System.out.println("/------------------------------------------------------------------/");
    }
    public void ShowLastDataInHistory(int index){
        dataHistory.get(dataHistory.size()-1).ShowInfo();
        System.out.println("/------------------------------------------------------------------/");
    }
    public void ViewHistory(){
        for (var item: dataHistory){
            item.ShowInfo();
            System.out.println("/------------------------------------------------------------------/");
        }
    }
    public void ViewHistory(int index){
        for (var item: dataHistory){
             item.ReturnDataOnIndex(index);
             System.out.println("/------------------------------------------------------------------/");
        }
    }
    public int MethodForTest(){
        return dataHistory.size();
    }
}
