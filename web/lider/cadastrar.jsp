<%--
  Created by IntelliJ IDEA.
  User: jeffe
  Date: 06/12/2018
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Lideres</title>
    </head>
    <body>
        <h1>Cadastro de Lideres</h1>
        <form name="formCadastro" method="post" action="salvar.jsp">
            <label>Nome</label>
            <input type="text" name="nome" value="">
            <br>
            <label>CPF</label>
            <input type="text" name="cpf" value="">
            <br>
            <label>Telefone</label>
            <input type="text" name="telefone" value="">
            <br>
            <label>Cidade</label>
            <input type="text" name="cidade" value="">
            <br>
            <label>Estado</label>
            <select name="estado">
                <option value="SP">São Paulo</option>
                <option value="RJ">Rio de Janeiro</option>
                <option value="BA">Bahia</option>
            </select>
            br>
            <label>Data de Nascimento</label>
            <input type="datetime-local" name="dataNascimento" value="">
            <input type="submit" name="salvar" value="">
        </form>

    </body>
</html>
