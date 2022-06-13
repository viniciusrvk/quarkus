package com.viniciusrvk.service;

public class CalculadoraService {

    public Integer calcular(Integer posicao){
        if( posicao <= 0){
            return 0;
        }else if(posicao == 1){
            return 1;
        }else if(posicao == 2){
            return 1;
        }else {
            return calcular(posicao-3)+calcular(posicao-2);
        }
    }
}
