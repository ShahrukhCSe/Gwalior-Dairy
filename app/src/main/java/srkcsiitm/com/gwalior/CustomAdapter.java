package srkcsiitm.com.gwalior;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SHAHRUKH KHAN on 07-05-2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    Activity context;
    private final String[] Foods;
    private final Integer[] Imgid;


    public CustomAdapter(Activity context, String[] Foods, Integer[] Imgid) {
        super(context, R.layout.custom_row, Foods);

        this.context = context;
        this.Foods = Foods;
        this.Imgid = Imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        if (row==null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
             row = layoutInflater.inflate(R.layout.custom_row, parent, false);
        }
        ImageView myImage = (ImageView) row.findViewById(R.id.img);
        TextView myText = (TextView) row.findViewById(R.id.txt);
        myImage.setImageResource(Imgid[position]);
        myText.setText(Foods[position]);


        return row;
    }
};