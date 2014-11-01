package com.example.menu;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

	WebView myWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public void web(){
		Toast.makeText(this, "PANTALLA WEB", Toast.LENGTH_LONG).show();
		this.setContentView(R.layout.web);//AT
        myWebView = (WebView) this.findViewById(R.id.webView1);
        myWebView.getSettings().setJavaScriptEnabled(true);//JS 
        myWebView.loadUrl("file:///android_asset/index.html");
	}
	
	//-OPCIONES DE MENÚ
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.menuItemHola:
			Toast.makeText(this, "PANTALLA DEFAULT", Toast.LENGTH_LONG).show();
			setContentView(R.layout.activity_main);
			return true;
		case R.id.menuItemCal:
			Toast.makeText(this, "PANTALLA CALENDARIO", Toast.LENGTH_LONG).show();
			setContentView(R.layout.calendario);
			return true;
		case R.id.menuItemImagen:
			Toast.makeText(this, "PANTALLA IMAGEN ", Toast.LENGTH_LONG).show();
			setContentView(R.layout.imagen);
			return true;
		case R.id.menuItemWeb:
			web();
			return true;
		case R.id.menuItemSalir:
			finish();
			return true;
		default :
			return super.onOptionsItemSelected(item);				
		}
	}
}
