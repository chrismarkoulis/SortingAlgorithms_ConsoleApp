/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author chris
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* 
           make a TshirtPrinter object, TshirtPrinter makes a List<Tshirt> and
           utilize bubble-sort, quick-sort and bucket-sort methods

         */
        
         /* input order: 0 -> [ASC]
                         1 -> [DESC]
         */
         
        TshirtPrinter printer = new TshirtPrinter();

        /* 
        Print 50 Tshirts with each method and
        Record each method's duration for comparison purpose
        
         */
        //<editor-fold defaultstate="collapsed" desc="Size Sorting">
        System.out.println("************************** Size Sorting *************************************");
        long startTime = System.currentTimeMillis();
        printer.bubbleSortBySize(50, 0);
        long endTime = System.currentTimeMillis();
        System.out.println("BubbleSort method duration: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        printer.quickSortBySize(50, 0);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort method duration: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        printer.bucketSortBySize(50, 0, 2);
        endTime = System.currentTimeMillis();
        System.out.println("BucketSort method duration: " + (endTime - startTime) + "ms");
        System.out.println("\n****************************************************************************\n");
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Color Sorting">
        System.out.println("************************** Color Sorting *************************************");
        startTime = System.currentTimeMillis();
        printer.bubbleSortByColor(50, 0);
        endTime = System.currentTimeMillis();
        System.out.println("BubbleSort method duration: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        printer.quickSortByColor(50, 0);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort method duration: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        printer.bucketSortByColor(50, 0, 2);
        endTime = System.currentTimeMillis();
        System.out.println("BucketSort method duration: " + (endTime - startTime) + "ms");
        System.out.println("\n****************************************************************************\n");
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Fabric Sorting">
        System.out.println("************************** Fabric Sorting *************************************");
        startTime = System.currentTimeMillis();
        printer.bubbleSortByFabric(50, 0);
        endTime = System.currentTimeMillis();
        System.out.println("BubbleSort method duration: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        printer.quickSortByFabric(50, 0);
        endTime = System.currentTimeMillis();
        System.out.println("QuickSort method duration: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        printer.bucketSortByFabric(50, 0, 2);
        endTime = System.currentTimeMillis();
        System.out.println("BucketSort method duration: " + (endTime - startTime) + "ms");
        System.out.println("\n****************************************************************************\n");
        //</editor-fold>
    }

}
