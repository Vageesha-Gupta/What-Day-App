package androidsamples.java.whatday;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Find views by ID
    EditText editDate = findViewById(R.id.editDate);
    EditText editMonth = findViewById(R.id.editMonth);
    EditText editYear = findViewById(R.id.editYear);
    Button btnCheck = findViewById(R.id.btn_check);
    TextView txtDisplay = findViewById(R.id.txt_display);

    // Set an OnClickListener on the button
    btnCheck.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Retrieve input from EditText fields
        String day = editDate.getText().toString();
        String month = editMonth.getText().toString();
        String year = editYear.getText().toString();

        // Initialize DateModel with the input data
        DateModel dateModel = new DateModel();
        dateModel.initialize(day, month, year);

        // Retrieve the message and display it in the TextView
        txtDisplay.setText(dateModel.getMessage());
      }
    });
//    Button buttonSend = findViewById(R.id.button_send);
//
//    // Set an OnClickListener on the button
//    buttonSend.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//        // Code to execute when the button is clicked
//        Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show();
//      }
//    });
  }

}