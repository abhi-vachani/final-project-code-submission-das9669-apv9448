import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.*;




public class LastSeasonCleanReducer extends Reducer<Text, Text, Text, Text> {

 @Override
 public void reduce(Text key, Iterable<Text> values, Context context)
 throws IOException, InterruptedException {
   


   for (Text value: values)
   {
           context.write(key, value);

   }








   


  }


 }
