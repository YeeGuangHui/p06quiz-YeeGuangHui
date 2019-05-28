package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNum1;
    EditText etNum2;
    TextView tvOperation;
    TextView tvSum;
    Button btnReset;
    int sumOf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvOperation = findViewById(R.id.tvOperation);
        tvSum = findViewById(R.id.tvSum);
        btnReset = findViewById(R.id.btnReset);

        sumOf = 0;
        int sumOf = Integer.parseInt(tvSum.getStringExtra("pax"));

        tvSum.setOnEditorActionListener(new View.OnClickListener()){
            int sumOf = etNum1  etNum2;
            tvSum.setText(0);
        };

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1.setText(0);
                etNum2.setText(0);
                tvSum.setText(0);
            }
        });
    }
}
