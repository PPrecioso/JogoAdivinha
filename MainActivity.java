package com.example.jogoadivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int numeroAleatorio;
    private int tentativas;

    private TextView textViewTentativas;
    private TextView textViewTentativasContagem;
    private EditText editTextNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTentativas = findViewById(R.id.Tent);
        textViewTentativasContagem = findViewById(R.id.nTent);
        editTextNumero = findViewById(R.id.número);

        iniciarJogo();
    }

    private void iniciarJogo() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1; // Número entre 1 e 100
        tentativas = 0;
        textViewTentativasContagem.setText("0");
        editTextNumero.setText("");
    }

    public void btDicaTP(View view) {
        if (numeroAleatorio % 2 == 0) {
            Toast.makeText(this, "Dica: O número é par.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Dica: O número é ímpar.", Toast.LENGTH_SHORT).show();
        }
    }

    public void adivinharTP(View view) {
        String textoNumero = editTextNumero.getText().toString();

        if (textoNumero.isEmpty()) {
            Toast.makeText(this, "Por favor, insira um número!", Toast.LENGTH_SHORT).show();
            return;
        }

        int palpite = Integer.parseInt(textoNumero);
        tentativas++;

        if (palpite < 1 || palpite > 100) {
            Toast.makeText(this, "O número deve estar entre 1 e 100.", Toast.LENGTH_SHORT).show();
            return;
        }

        if (palpite == numeroAleatorio) {
            Toast.makeText(this, "Parabéns! Você acertou!", Toast.LENGTH_SHORT).show();
            iniciarJogo(); // Reinicia o jogo
        } else if (palpite < numeroAleatorio) {
            Toast.makeText(this, "Tente um número maior!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tente um número menor!", Toast.LENGTH_SHORT).show();
        }

        textViewTentativasContagem.setText(String.valueOf(tentativas));
    }

    public void btMenosTP(View view) {
        Toast.makeText(this, "Tente um número menor!", Toast.LENGTH_SHORT).show();
    }

    public void btMaisTP(View view) {
        Toast.makeText(this, "Tente um número maior!", Toast.LENGTH_SHORT).show();
    }
}
