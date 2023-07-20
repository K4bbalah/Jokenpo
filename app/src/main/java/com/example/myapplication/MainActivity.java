package com.example.myapplication;

import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import java.util.Random;

import com.example.myapplication.R;

public class MainActivity extends Activity {



     TextView t1,t2;
     int eu;
     Random cpu=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    
    
public void  Pedra(View v) {
  
  eu=1;
}

public void  Papel(View v) {
  
  eu=2;
}


public void  Tesoura(View v) {
  
  eu=3;
}


public void Start(View v){

     
    t1=(TextView)findViewById (R.id.resp);
    t2=(TextView)findViewById (R.id.cpu);
  
  
   int cpu1=cpu.nextInt(3)+1;
   
 
 if (cpu1 == 1){
   t2.setText ("CPU escolheu:Pedra");
 }
 else if(cpu1 == 2){
t2.setText("CPU escolheu:Papel");
   
 }
 else if(cpu1 == 3){
   
t2.setText("CPU escolheu:Tesoura");
 }
 if (eu==cpu1){
     t1.setText("Empate!");
     }
     else if(eu == 3  && cpu1 == 2){
      
       
       t1.setText("Você Ganhou! tesoura corta papel!");
     }
     else if(eu == 2 && cpu1 == 1){
       
       t1.setText("Você Ganhou! papel cobre pedra!");}
     else if(eu ==1 && cpu1 == 3){
       
       t1.setText("Você Ganhou! Pedra quebra tesoura!");}
   
   else if(eu == 3  && cpu1 == 2){
       
       t1.setText("Você Ganhou! tesoura corta papel!");
     }
     else if(eu == 2 && cpu1 == 1){
       
       t1.setText("Você Ganhou! papel cobre pedra!");}
       else if(
       eu ==1 && cpu1 == 3){
       
       t1.setText("Você Ganhou! Pedra quebra tesoura!");}
       else if( cpu1 == 3  && eu == 2){
       t1.setText("O Computador Ganhou! tesoura corta papel!");
     }else if(cpu1 == 2 && eu == 1){
       
       t1.setText("O Computador Ganhou! papel cobre pedra!");}
    else if(cpu1 ==1 && eu == 3){
       
       t1.setText("O Computador  Ganhou! Pedra quebra tesoura!");}
       else{
   
       t1.setText ("Escolha um Opção  Valida!") ; 
       t2.setText("Invalido!") ;   }}
       
      
       
}
