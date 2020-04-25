package java.com.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void guess(View view){
        String message;
//        Button button=findViewById (R.id.guessNumber);
        EditText editText=(EditText)findViewById(R.id.text);
        int guessValue= Integer.parseInt(editText.getText().toString());
        if(guessValue>randomNumber)
        {
            message="Entered number fucks";
        }
        else if(guessValue<randomNumber){
            message="Entered number sucks";
        }
        else
        {
            message="Tu toh bahot hard nikla";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randomNumber= rand.nextInt(50)+1;
    }
}
