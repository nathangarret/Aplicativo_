package com.example.easyfarm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Tela_MeAjuda extends AppCompatActivity {

    public String Host="";
    public String url;
    String urlsite ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);

        BottomNavigationView navigationView = findViewById(R.id.nav);
        navigationView.setSelectedItemId(R.id.nav_MyAccount);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_Home:
                        startActivity(new Intent(getApplicationContext(),
                                Tela_Principal.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.nav_MyAccount:
                        startActivity(new Intent(getApplicationContext(),
                                Tela_MinhaConta.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        findViewById(R.id.resgate_cupom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Como fazer o resgate do cupom de desconto?");
                builder.setMessage("- Na tela Home ou Cupons" + "\n" +
                        "- Clique em algum card em espec??fico" + "\n" +
                        "- Selecione a op????o de ir para o Site" + "\n" +
                        "- Logue com sua conta,abre o carrinho e finalize sua compra");
                builder.setNeutralButton("OK",null);
                builder.show();
                // Intent back_ajuda = new Intent(Tela_MeAjuda.this,Tela_MinhaConta.class);
                //  startActivity(back_ajuda);

            }
        });

        findViewById(R.id.resgate_cupnfunc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Por que meu cupom n??o est?? resgatando?");
                builder.setMessage("A partir do momento que voc?? finaliza sua compra com um determinado cupom,este cupom n??o " +
                        "estar?? mais disponivel para o resgate na sua conta.");
                builder.setNeutralButton("OK",null);
                builder.show();
            }
        });

        findViewById(R.id.resgate_temppedido).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Quanto tempo leva para o meu pedido chega?");
                builder.setMessage("O seu pedido levar?? o tempo de chegada de acordo com o envio do vendedor.Todos os vendedores possuem tempo de despacho j?? indicado na compra do pedido.");
                builder.setNeutralButton("OK",null);
                builder.show();
            }
        });

        findViewById(R.id.resgate_compraaprov).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Como sei que a minha compra foi aprovada?");
                builder.setMessage("Se o pagamento foi processado com sucesso, o cliente ser?? conduzido a uma nova p??gina ao receber uma notifica????o de compra aprovada. O cliente dever?? receber a notifica????o logo ap??s o pagamento com m??todos de pagamento autom??ticos.");
                builder.setNeutralButton("OK",null);
                builder.show();
            }
        });


        findViewById(R.id.resgate_vendaprod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Como fa??o a venda dos meus produtos?");
                builder.setMessage("Abra o site da EasyFarm,ao fazer o cadastro como vendedor, basta o usu??rio ir na ??rea de vendas e cadastrar seus produtos conforme o andamento que o site solicita. Nosso site permite que os lojistas sejam vendedores e compradores, ocupando posi????es de destaque na hora da venda.");
                builder.setNeutralButton("OK",null);
                builder.show();
            }
        });

        findViewById(R.id.card_cntt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sup = new Intent(Tela_MeAjuda.this,Tela_Suporte.class);
                startActivity(sup);
            }
        });

        findViewById(R.id.card_work).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Tela_MeAjuda.this);
                builder.setTitle("Trabalhe conosco");
                builder.setMessage("Veja as vagas em aberto na EasyFarm e fa??a parte da nossa equipe :)");
                builder.setNeutralButton("OK",null);
                builder.show();
            }
        });

        findViewById(R.id.card_site).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_btn(urlsite);
            }
        });

        findViewById(R.id.back_ajuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_ajuda = new Intent(Tela_MeAjuda.this,Tela_MinhaConta.class);
                startActivity(back_ajuda);
            }
        });

        findViewById(R.id.card_suporte).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_suporte = new Intent(Tela_MeAjuda.this,Tela_Suporte.class);
                startActivity(card_suporte);
            }
        });

        /*
        findViewById(R.id.card_perguntasfreq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_pergfreq = new Intent(Tela_MeAjuda.this,Tela_PerguntasFreq.class);
                startActivity(card_pergfreq);
            }
        });
        */
    }

    public void clicked_btn(String str){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlsite));
        startActivity(intent);
    }
}