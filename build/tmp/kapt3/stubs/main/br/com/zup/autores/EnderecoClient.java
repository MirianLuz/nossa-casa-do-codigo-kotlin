package br.com.zup.autores;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/autores/EnderecoClient;", "", "consulta", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/autores/EnderecoResponse;", "cep", "", "nossa-casa-do-codigo"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:8081/cep/")
public abstract interface EnderecoClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "{cep}")
    public abstract io.micronaut.http.HttpResponse<br.com.zup.autores.EnderecoResponse> consulta(@org.jetbrains.annotations.NotNull
    java.lang.String cep);
}