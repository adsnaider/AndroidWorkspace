package adam.calculatorv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class NumberInput extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_input);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_number_input, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sum(View view) {
        Intent intent = new Intent(this, Result.class);
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(num1Text.getText().toString());
        int num2 = Integer.parseInt(num2Text.getText().toString());
        String total = ((Integer) (num1 + num2)).toString();
        intent.putExtra("total", total);

        startActivity(intent);
    }

    public void substract(View view) {
        Intent intent = new Intent(this, Result.class);
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(num1Text.getText().toString());
        int num2 = Integer.parseInt(num2Text.getText().toString());
        String total = ((Integer) (num1 - num2)).toString();
        intent.putExtra("total", total);

        startActivity(intent);
    }

    public void multiplication(View view) {
        Intent intent = new Intent(this, Result.class);
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(num1Text.getText().toString());
        int num2 = Integer.parseInt(num2Text.getText().toString());
        String total = ((Integer) (num1 * num2)).toString();
        intent.putExtra("total", total);

        startActivity(intent);
    }

    public void division(View view) {
        Intent intent = new Intent(this, Result.class);
        EditText num1Text = (EditText) findViewById(R.id.number1);
        EditText num2Text = (EditText) findViewById(R.id.number2);
        int num1 = Integer.parseInt(num1Text.getText().toString());
        int num2 = Integer.parseInt(num2Text.getText().toString());
        String total = ((Double)(num1 / (double)num2)).toString();
        intent.putExtra("total", total);

        startActivity(intent);
    }
}
