package com.example.testrfid;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class AccueilTestRFID extends Activity  {
	
	NfcAdapter mNfcAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accueil_test_rfid);
		
		// Test de la présence du nfc sur le mobile
        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if (mNfcAdapter == null) {
            Toast.makeText(this, "NFC non disponible =(", Toast.LENGTH_LONG).show();
            finish();
            return;
        }
        else {
        	Toast.makeText(this, "NFC disponible =)", Toast.LENGTH_LONG).show();
        }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.accueil_test_rfid, menu);
		return true;
	}

}
