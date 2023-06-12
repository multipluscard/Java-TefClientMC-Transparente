<h1 font-family: "Arial">Sobre o Exemplo</h1>

### 

Integração DLL Transparente Java

###### Linguagem 
**Java**

<hr>

### Descrição do Projeto 

Implementação em **Java**, com o objetivo de auxiliar no processo de integração da Automação Comercial com DLL TefClientMC (Layout Transparente) responsável pela comunicação com a Solução de TEF, responsável por realizar transações de crédito, débito, serviços e outros. \
<b>Utilize o Guia Técnico sempre como referência</b>, onde todas as funções e parâmetros estão descritos com detalhes. \
Para obter a versão mais recente da DLL baixe através do Portal do Representante na sessão Downloads.

<hr>

<h3>Function <kbd style="background-color: #B0C4DE; color:#383637" >AtribuirosDados()</kbd> </h3>

Função implementada para recuperar os dados do arquivo <kbd style="background-color: #4682B4; color:#383637" >.txt</kbd>. Arquivo se encontra na pasta raiz do projeto, pode ser modificado de forma manual inserindo os dados de teste.

° CNPJ; \
° PDV; \
° CODIGO DA LOJA. 

![](./FunctionArquivoTxt.png)
<hr>

### Como utilizar 
````
→ Faça o download.  
→ Baixe a versão de DLL mais recente no Portal do Representante. 
→ Cole a DLL dentro da raiz do projeto.
→ Execute.
````

<h4> <b> Nota: Existem versões x86 e x64 da DLL</b> </h4>

<h5> <b> Exception: DLL não foi encontrada, programa não conseguiu Carregar. Verificar se DLL consta na raiz do projeto. </b> </h5>

![](./exception.png)

<h5> <b> Exemplo deve estar executando em modo administrador. <b> </h5>

![](./warning.png)
