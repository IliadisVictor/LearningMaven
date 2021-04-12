package gradeshistogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 *
 * @author iliadisvictor The purpose of this class is it take in a txt of students grades
 *         and create a histogram.
 * @since April 2021
 */

public class HistogramGenerator {

    /***
     * Receives from command line the name of the text file to be used
     *  generate an  array list containing the grades
     * @param textname String
     */

    public int[] CreateArray(String textname) {
        /*
        * Method for the storage of the frequency of every grade from a given file in a scale 0-10
         */
        int[] gradesvalues = new int[11];
        try {
            File myObj = new File(textname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int i = Integer.parseInt(data);
                gradesvalues[i]+=1;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            // catch to handle the case of wrong file name input from user
            System.out.println("Couldn't find file with given name");
            System.exit(0);
        }
        return gradesvalues;
    }

    /***
     * Receives the int array  and uses it to create the histogram
     * using the array to create the data set that will be used
     * for the visualization
     * @param grades int[]
     */



    public void GenerateChart(int[] grades) {
        /*
         * The XYSeriesCollection object is a set XYSeries series (dataset) that
         * can be visualized in the same chart
         */
        XYSeriesCollection dataset = new XYSeriesCollection();
        /*
         * The XYSeries that are loaded in the dataset. There might be many
         * series in one dataset.
         */
        XYSeries data = new XYSeries("random values");

        /*
         * Populating the XYSeries data object from the input Integer array list
         * values.
         */
        int i=0;
        for (i=0;i< grades.length;i++) {
            data.add(i, grades[i]);
        }

            // add the series to the dataset
        dataset.addSeries(data);

        boolean legend = false; // do not visualize a legend
        boolean tooltips = false; // do not visualize tooltips
        boolean urls = false; // do not visualize urls

        // Declare and initialize a createXYLineChart JFreeChart
        JFreeChart chart = ChartFactory.createXYLineChart
                ("Grade Frequency", "Grade", "Frequency", dataset,
                PlotOrientation.VERTICAL, legend, tooltips, urls);

        /*
         * Initialize a frame for visualizing the chart and attach the
         * previously created chart.
         */
        ChartFrame frame = new ChartFrame("First", chart);
        frame.pack();
        // makes the previously created frame visible
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        HistogramGenerator obj = new HistogramGenerator(); // Create Object to call created methods
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Input the name of the file with grades: ");
        String textname = scanner.nextLine(); // read user input
        int[] grades = obj.CreateArray(textname); // store array from grades text
        obj.GenerateChart(grades); // generate chart
    }
}



