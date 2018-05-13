package demo.kiel.com.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private RadioGroup radioGroup ;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private Button button1;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private TextView lablel1;
    private TextView lablel2;
    private TextView lablel3;
    String toppings,crust,email,address,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        lablel1 = (TextView) findViewById(R.id.emailtext);
        lablel2 = (TextView) findViewById(R.id.addresstext);
        lablel3 = (TextView) findViewById(R.id.phonenumbertext);
        button1 = (Button) findViewById(R.id.confirmyourorder);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        checkBox1 = (CheckBox) findViewById(R.id.extrachesse);
        checkBox2 = (CheckBox) findViewById(R.id.tomatoes);
        checkBox3 = (CheckBox) findViewById(R.id.onion);

    }


    public void onClick(View v) {


        int selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioButton1 = (RadioButton) findViewById(selectedId);


        crust = radioButton1.getText().toString();


        if (checkBox1.isChecked()) {
            toppings = "Extracheese";
        }
        if (checkBox2.isChecked()) {
            toppings = "Toppings";
        }
        if (checkBox3.isChecked()) {
            toppings = "Tomatoes";
        }
        if (checkBox1.isChecked() && checkBox2.isChecked()) {
            toppings = "With Tomatoes & Extra Cheese";
        }
        if (checkBox1.isChecked() && checkBox3.isChecked()) {
            toppings = "With Onions & Extra Cheese";
        }
        if (checkBox3.isChecked() && checkBox2.isChecked()) {
            toppings = "With Tomatoes & Onions";
        }
        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
            toppings = "With Tomatoes & Extra Cheese & Onions";
        }

        email = lablel1.getText().toString();
        address = lablel2.getText().toString();
        phone  = lablel3.getText().toString();

        if (v == button1) {
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setTitle("Your order is on it's way..");
            alertDialog.setMessage(crust + "\n" + toppings + "\n Your email: \t" + email + "\n Delivery Address \t" + address +
            "\n Phone number \t" + phone);
            alertDialog.show();
        }

    }}






