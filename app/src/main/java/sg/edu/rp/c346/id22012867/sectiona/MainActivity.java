package sg.edu.rp.c346.id22012867.sectiona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        this.setTitle("ArrayList");

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");



        String text = "Fruits";
        text += "\n";
        text += "=====";
        text += "\n";

        String theFruit = fruits.get(1);

        fruits.remove(0);

        fruits.set(fruits.size() - 1, "dragon fruit");

        for (int x = 0; x < fruits.size(); x++) {
            text += fruits.get(x) + "\n";
        }

        tv.setText(text);





    }
}