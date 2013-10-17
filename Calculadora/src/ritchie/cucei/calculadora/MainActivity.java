package ritchie.cucei.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int temp = 0;
	int op = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		/***/
		final TextView display = (TextView)findViewById(R.id.display);

		Button uno = (Button)findViewById(R.id.uno);
		Button dos = (Button)findViewById(R.id.dos);
		Button tres = (Button)findViewById(R.id.tres);
		Button cuatro = (Button)findViewById(R.id.cuatro);
		Button cinco = (Button)findViewById(R.id.cinco);
		Button seis = (Button)findViewById(R.id.seis);
		Button siete = (Button)findViewById(R.id.siete);
		Button ocho = (Button)findViewById(R.id.ocho);
		Button nueve = (Button)findViewById(R.id.nueve);
		Button cero = (Button)findViewById(R.id.cero);

		Button suma = (Button)findViewById(R.id.btnSuma);
		Button resta = (Button)findViewById(R.id.btnResta);
		Button divide = (Button)findViewById(R.id.btnDivide);
		Button multiplica = (Button)findViewById(R.id.btnMultiplica);
		Button igual = (Button)findViewById(R.id.btnIgual);


		uno.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"1");
			}
		});

		dos.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"2");
			}
		});

		tres.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"3");
			}
		});

		cuatro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"4");
			}
		});

		cinco.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"5");
			}
		});

		seis.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"6");
			}
		});

		siete.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"7");
			}
		});

		ocho.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"8");
			}
		});

		nueve.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"9");
			}
		});

		cero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				display.setText( display.getText() +"0");
			}
		});


		/***/



		resta.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				temp = Integer.parseInt((String) display.getText());;

				display.setText("");
				op=2;
			}
		});

		multiplica.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				temp = Integer.parseInt((String) display.getText());;

				display.setText("");
				op=3;
			}
		});

		divide.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				temp = Integer.parseInt((String) display.getText());;

				display.setText("");
				op=4;
			}
		});

		suma.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				temp = Integer.parseInt((String) display.getText());;
				op = 1;
				display.setText("");
			}
		});

		igual.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				switch(op){
				case 0: 
					break;
				case 1://Suma
					temp = (temp + Integer.parseInt(display.getText().toString()));
					display.setText( Integer.toString(temp));
					break;
				case 2:
					temp = (temp - Integer.parseInt(display.getText().toString()));
					display.setText( Integer.toString(temp));
					break;
				case 3:
					temp = (temp * Integer.parseInt(display.getText().toString()));
					display.setText( Integer.toString(temp));
					break;
				case 4:
					temp = (temp / Integer.parseInt(display.getText().toString()));
					display.setText( Integer.toString(temp));
					break;
				
				default:
					break;
				}
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
