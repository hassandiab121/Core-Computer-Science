public class BruteCollinearPoints /* class for Brute Force approach to detect the line segment contain 4 points from several points*/
{

    private int numbersOfLines = 0;
    
    private final LineSegment[] lineSegments;


    private Point[][] lineSegmentPoints;
    public BruteCollinearPoints(Point[] points){
        findException(points);

        lineSegments = new LineSegment[ (points.length / 4) + 2];        // consider at the best case every 4 point represent a line segment (mean length of arr / 4)
         lineSegmentPoints = new Point[3][points.length / 2];   // store points of detected line segments to prevent replicated lines
        boolean flag;                                          // flag to stop scanning and start to discover new point if we find a line segment

        for (int OriginPoint = 0; OriginPoint < points.length-1; OriginPoint++) // chose origin point
        {
             flag = true;

            for (int first_ComparedPoint =  1; first_ComparedPoint < points.length; first_ComparedPoint++) // chose second point in line
            {
                // break the loop when we detect a line regarding this direction of points
                 if (!flag)
                     break;

                for (int second_ComparedPoint = first_ComparedPoint + 1; second_ComparedPoint < points.length; second_ComparedPoint++) // chose third point
                {
                    // break the loop when we detect a line regarding this direction of points
                    if (!flag)
                        break;

                    for (int third_ComparedPoint = second_ComparedPoint + 1; third_ComparedPoint < points.length; third_ComparedPoint++) // chose forth point
                    {
                        double Equalness_Of_SecondLineSlope_with_FirstL = points[OriginPoint].slopeOrder().compare(points[first_ComparedPoint] , points[second_ComparedPoint]);
                        double Equalness_Of_ThirdLineSlope_with_SecondL = points[OriginPoint].slopeOrder().compare(points[second_ComparedPoint] , points[third_ComparedPoint]);
                        /**the logic of the program divided into two phases
                         - first : we determined if the points o the same line.
                         - second : we check if the of points in order or not and th whole line detected before or note.
                          */
                        if ( Equalness_Of_SecondLineSlope_with_FirstL == 0 && Equalness_Of_ThirdLineSlope_with_SecondL ==0 )
                        {
                            if ( numbersOfLines == 0 || isPointsInOrder(points[OriginPoint],points[first_ComparedPoint],points[second_ComparedPoint],points[third_ComparedPoint]))
                            {

                                lineSegments[numbersOfLines] = new LineSegment(points[OriginPoint], points[third_ComparedPoint]);

                                lineSegmentPoints[0][numbersOfLines] = points[OriginPoint];
                                lineSegmentPoints[1][numbersOfLines++] = points[third_ComparedPoint];

                                flag = false;
                                break;
                            }
                        }
                    }
                }
            }
        }


    }



    public int numberOfSegments(){return  numbersOfLines;}

    public LineSegment[] segments(){ return lineSegments;}

    // if line replicate with another detected line return true else return false
    private boolean isLinesReplicated(Point p1, Point p4){
        for (int line = 0; lineSegmentPoints[0][line] != null; line++)
        {
            if (lineSegmentPoints[0][line] == p4 || lineSegmentPoints[1][line] == p1)
                return true;
        }
        return false;
    }
    // if line points in harmonic order and not replicated return true else false
    private boolean isPointsInOrder(Point p1, Point p2, Point p3, Point p4)
    {
        return ( p1.compareTo(p2) == p2.compareTo(p3) && p2.compareTo(p3) == p3.compareTo(p4) ) && !isLinesReplicated(p1,p4);
    }

    private void findException(Point[] arr){
        for (int index =0; index < arr.length; index++){
            for (int index2 = index + 1; index2 < arr.length; index2++)
                if (arr == null || arr[index] == null || arr[index2] == null || arr[index].compareTo(arr[index2]) == 0)
                    throw new IllegalArgumentException();
        }
    }


}
