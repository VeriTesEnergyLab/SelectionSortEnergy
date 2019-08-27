/**
 *
 * @author danilo_alvees
 */

import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class SelectionSortEnergy {
    public static void selectionSortVector(Vector<Integer> numbers) {
        int x = 0,y = 0, z = 0;
        //double consumption4 = 0;
        //double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        
        //2
        double[] before2 = EnergyCheckUtils.getEnergyStats(); 
        int i, j;
        int min, temp;
        int size = numbers.size();
        double[] after2 = EnergyCheckUtils.getEnergyStats();
        double consumption2 = ((after2[0] - before2[0]) + (after2[1] - before2[1]) + (after2[2] - before2[2])) / 10.0;
        System.out.println("\nPower consumption 2: " + consumption2);
        //2

        //3
        //double[] before3 = EnergyCheckUtils.getEnergyStats(); 
        for (i = 0; i < size-1; i++){
            x++;
            //4
            //double[] before4 = EnergyCheckUtils.getEnergyStats(); 
            min = i;
            //double[] after4 = EnergyCheckUtils.getEnergyStats();
            //consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //4

            //5
            //double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (j = i+1; j < size; j++)
            {
                y++;
                //6
                double[] before6 = EnergyCheckUtils.getEnergyStats(); 
                if (numbers.get(j) < numbers.get(min)){
                  min = j;
                  z++;
                }
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
                //6
            }
            //double[] after5 = EnergyCheckUtils.getEnergyStats();
            //consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5

            //7
            double[] before7 = EnergyCheckUtils.getEnergyStats();
            temp = numbers.get(i);
            numbers.set(i, numbers.get(min));
            numbers.set(min, temp);
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
            //7
          
        }
        //double[] after3 = EnergyCheckUtils.getEnergyStats();
        //double consumption3 = ((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0;
        //3
        
        //System.out.println("\nPower consumption 3: " + consumption3/x + " N: " + x);
        //System.out.println("\nPower consumption 4: " + consumption4/x + " N: " + x);
        //System.out.println("\nPower consumption 5: " + consumption5/y + " N: " + y);        
        System.out.println("\nPower consumption 6: " + consumption6/z + " N: " + z);
        System.out.println("\nPower consumption 7: " + consumption7/x + " N: " + x);
    }

    public static void selectionSortArrayList(ArrayList<Integer> numbers) {
        int x = 0,y = 0, z = 0;
        //double consumption4 = 0;
        //double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        
        //2
        double[] before2 = EnergyCheckUtils.getEnergyStats(); 
        int i, j;
        int min, temp;
        int size = numbers.size();
        double[] after2 = EnergyCheckUtils.getEnergyStats();
        double consumption2 = ((after2[0] - before2[0]) + (after2[1] - before2[1]) + (after2[2] - before2[2])) / 10.0;
        System.out.println("\nPower consumption 2: " + consumption2);
        //2

        //3
        //double[] before3 = EnergyCheckUtils.getEnergyStats(); 
        for (i = 0; i < size-1; i++){
            x++;
            //4
            //double[] before4 = EnergyCheckUtils.getEnergyStats(); 
            min = i;
            //double[] after4 = EnergyCheckUtils.getEnergyStats();
            //consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //4

            //5
            //double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (j = i+1; j < size; j++)
            {
                y++;
                //6
                double[] before6 = EnergyCheckUtils.getEnergyStats(); 
                if (numbers.get(j) < numbers.get(min)){
                  min = j;
                  z++;
                }
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
                //6
            }
            //double[] after5 = EnergyCheckUtils.getEnergyStats();
            //consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5

            //7
            double[] before7 = EnergyCheckUtils.getEnergyStats();
            temp = numbers.get(i);
            numbers.set(i, numbers.get(min));
            numbers.set(min, temp);
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
            //7
          
        }
        //double[] after3 = EnergyCheckUtils.getEnergyStats();
        //double consumption3 = ((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0;
        //3
        
        //System.out.println("\nPower consumption 3: " + consumption3/x + " N: " + x);
        //System.out.println("\nPower consumption 4: " + consumption4/x + " N: " + x);
        //System.out.println("\nPower consumption 5: " + consumption5/y + " N: " + y);        
        System.out.println("\nPower consumption 6: " + consumption6/z + " N: " + z);
        System.out.println("\nPower consumption 7: " + consumption7/x + " N: " + x);
    }    

    public static void selectionSortLinkedList(LinkedList<Integer> numbers) {
        int x = 0,y = 0, z = 0;
        //double consumption4 = 0;
        //double consumption5 = 0;
        double consumption6 = 0;
        double consumption7 = 0;
        
        //2
        double[] before2 = EnergyCheckUtils.getEnergyStats(); 
        int i, j;
        int min, temp;
        int size = numbers.size();
        double[] after2 = EnergyCheckUtils.getEnergyStats();
        double consumption2 = ((after2[0] - before2[0]) + (after2[1] - before2[1]) + (after2[2] - before2[2])) / 10.0;
        System.out.println("\nPower consumption 2: " + consumption2);
        //2

        //3
        //double[] before3 = EnergyCheckUtils.getEnergyStats(); 
        for (i = 0; i < size-1; i++){
            x++;
            //4
            //double[] before4 = EnergyCheckUtils.getEnergyStats(); 
            min = i;
            //double[] after4 = EnergyCheckUtils.getEnergyStats();
            //consumption4 += ((after4[0] - before4[0]) + (after4[1] - before4[1]) + (after4[2] - before4[2])) / 10.0;
            //4

            //5
            //double[] before5 = EnergyCheckUtils.getEnergyStats(); 
            for (j = i+1; j < size; j++)
            {
                y++;
                //6
                double[] before6 = EnergyCheckUtils.getEnergyStats(); 
                if (numbers.get(j) < numbers.get(min)){
                  min = j;
                  z++;
                }
                double[] after6 = EnergyCheckUtils.getEnergyStats();
                consumption6 += ((after6[0] - before6[0]) + (after6[1] - before6[1]) + (after6[2] - before6[2])) / 10.0;
                //6
            }
            //double[] after5 = EnergyCheckUtils.getEnergyStats();
            //consumption5 += ((after5[0] - before5[0]) + (after5[1] - before5[1]) + (after5[2] - before5[2])) / 10.0;
            //5

            //7
            double[] before7 = EnergyCheckUtils.getEnergyStats();
            temp = numbers.get(i);
            numbers.set(i, numbers.get(min));
            numbers.set(min, temp);
            double[] after7 = EnergyCheckUtils.getEnergyStats();
            consumption7 += ((after7[0] - before7[0]) + (after7[1] - before7[1]) + (after7[2] - before7[2])) / 10.0;
            //7
          
        }
        //double[] after3 = EnergyCheckUtils.getEnergyStats();
        //double consumption3 = ((after3[0] - before3[0]) + (after3[1] - before3[1]) + (after3[2] - before3[2])) / 10.0;
        //3
        
        //System.out.println("\nPower consumption 3: " + consumption3/x + " N: " + x);
        //System.out.println("\nPower consumption 4: " + consumption4/x + " N: " + x);
        //System.out.println("\nPower consumption 5: " + consumption5/y + " N: " + y);        
        System.out.println("\nPower consumption 6: " + consumption6/z + " N: " + z);
        System.out.println("\nPower consumption 7: " + consumption7/x + " N: " + x);
    }

    public static void main(String[] args) {
        EnergyCheckUtils.init();
        double[] beforeTotalEnergy = EnergyCheckUtils.getEnergyStats();  
        
        //0
        double[] before0 = EnergyCheckUtils.getEnergyStats();  
        int n = Integer.parseInt(args[0]);
        int opt = Integer.parseInt(args[1]);
        double[] after0 = EnergyCheckUtils.getEnergyStats();
        double consumption0 = ((after0[0] - before0[0]) + (after0[1] - before0[1]) + (after0[2] - before0[2])) / 10.0;
        System.out.println("\nPower consumption 0: " + consumption0);
        //0
        
        if (opt == 1) {
            Vector<Integer> numbers = new Vector<Integer>();
            //1
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.println("\nPower consumption 1: " + consumption1);        
            //1
            //2
            selectionSortVector(numbers);
            //2            
        }
        else if (opt == 2) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            //8
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.println("\nPower consumption 8: " + consumption1);        
            //8             
            //9
            selectionSortArrayList(numbers);
            //9            
        }
        else if (opt == 3) {
            LinkedList<Integer> numbers = new LinkedList<Integer>();
            //15
            double[] before1 = EnergyCheckUtils.getEnergyStats(); 
            for(int i = n; i >= 0; i--) {
                numbers.add(i);
            }
            double[] after1 = EnergyCheckUtils.getEnergyStats();
            double consumption1 = ((after1[0] - before1[0]) + (after1[1] - before1[1]) + (after1[2] - before1[2])) / 10.0;
            System.out.println("\nPower consumption 15: " + consumption1);        
            //15
            //16
            selectionSortLinkedList(numbers);
            //16            
        }
        

        
        
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//        }
        
//        System.out.println();

        
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + " ");
//        }

 
        //END
        
        double[] afterTotalEnergy = EnergyCheckUtils.getEnergyStats();
        double consumptionTotalEnergy = ((afterTotalEnergy[0] - beforeTotalEnergy[0]) + (afterTotalEnergy[1] - beforeTotalEnergy[1]) + (afterTotalEnergy[2] - beforeTotalEnergy[2])) / 10.0;
        System.out.println("\nPower consumption Total: " + consumptionTotalEnergy);        
    }

}