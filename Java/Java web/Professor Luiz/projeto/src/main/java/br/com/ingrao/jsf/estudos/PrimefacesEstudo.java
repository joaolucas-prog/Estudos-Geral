package br.com.ingrao.jsf.estudos;

public class PrimefacesEstudo {
	/*
	 * para utilizar o primeface você deve colocar sua dependencia na pom.xml e no
	 * seu xhtml importalo com o xmlns:p="http://primefaces.org/ui
	 * 
	 * Ele possui tags equivalentes ao jsf porem muda algumas propriedades, e sempre
	 * é bom utilizar um id 
	 * 
	 * CSS podemos utilizar css para estilizar a nossa página html, e também usar
	 * imgens , para isso crie uma pasta em webapp chamada resources e dentro da
	 * resources crie 2 pastas uma com nome css e outra com img
	 * 
	 * Algumas tags
	 *
	 * p:outputLabel value="" mostra um texto como valor value
	 * 
	 * <p:inputText
	 * value="#{bean2.pessoa.nome} size="" id="" requiredMenssage="" maxlength="" placeholder="" title="" disable="
	 * " /> uma caixa de input de texto em que o valor irá para o value ,com tamanho
	 * size, com o id = id , com mensagem de erro se enviar o campo vazio =
	 * requiredMenssage , tamanho maximo = maxlength , com texto inbutido =
	 * placeholer com nome ao botar mouse = title e desabilitado ou não = disable
	 * 
	 * p:commandButton value="Adicionar" action="#{bean2.adicionar}"
	 * update="form listaPessoas" botão de comando que terá o texto do value irá
	 * executar uma ação do action e irá atualizar os id no update
	 * 
	 * p:panel cria um painel
	 * 
	 * p:dataTable : cria uma tabela de dados que percorre um array automatico
	 * 
	 * p:column headerText="Editar" width="80" coluna com nome Editar no cabeçalho e
	 * tamanho 80 , se não por width ele divide o tamanho com as outras colunas
	 * 
	 * <p:button value="Editar" outcome="Sucesso.xhtml?paramtro=#{p.nome}" /> Botão
	 * com nome editar que ao clicar ele navega entre a pagina outcome
	 * ----------------------------------------------------------------------------------------------
	 * <p:password id="" feedback ="" weakLabel ="" goodLabel="" strongLabel=""
	 * inline ="" promptLabel="" match="" requiredMessage="" validatorMessage="">
	 * senha com id= id , mostrar mensagem ao digitar sobre a senha = feedback ,
	 * senha fraca = weakLabel, senha razoável = goodLabel senha forte =strongLabel,
	 * na mesma linha = inline, mensagem escrita = promptLabel , campo para
	 * confirmar senha =match , confirma se é obrigatoria = required, mensagem caso
	 * senha esteja vazia=requiredMessage , mensagem caso senha esteja diferente
	 * =validatorMessage
	 * 
	 * ex <p:outputLabel value="senha" for="senha"> <p:password id="senha" feedback
	 * ="true" weakLabel ="Senha Fraca" goodLabel="Senha Razoavel"
	 * strongLabel="Senha Forte" inline ="true" promptLabel="Insira sua senha"
	 * match="confirma" requiredMessage="Senha obrigatória"
	 * validatorMessage="Senhas diferentes"/> <p:outputLabel value="confirma senha"
	 * for="confirma" <p:password id = "confirma" required ="true"/>
	 *------------------------------------------------------------------------------------------------------
	 * <p:inpuTextarea rows="" style="" maxlength="" placeholder="" counter=""
	 * counterTemplate=""/> campo de texto com rows colunas, de estilo style, com
	 * tamanho max = maxlength , com descrição = placeholder , com contador de saida
	 * = counter, mensagem do contador = counterTemplate
	 * 
	 * ex:
	 * 
	 * <p:intputTextarea rows="6" style="width :50% " maxlength="10"
	 * placeholder="Descricao" counter="saida"
	 * counterTemplate="{0} caracteres restantes."/> 
	 * <p:outputLabel id ="saida"
	 * 
	 * ---------------------------------------------------------------------------------------------
	 * <p:toolbar> barra de ferramentas 
	 * 		<f:facet name="left"> espaço a esquerda
	 * 			<p:button value="" icon=""/> botão com valor value e icone icon (pesquisar no primefaces icon) aqui está sem ação 
	 * 			<span class="ui-separator> separador
	 * 				<span class ="ui-icon ui-icon-grip-dotted-vertical"/>icone do separador
	 * 			</span>
	 * 		</facet> 
	 * 		<f:facet name="right"> espaço a direita
	 * 			<p:menuButton value=""> botão de menu
	 * 				<p:menuitem value="" icon="" item do botao de menu
	 * 			</menuButton>
	 *  	</facet> 
	 *  </p:toolbar>
	 * 
	 * -------------------------------------------------------------------------------------
	 * Layout
	 * 
	 * <p:layout fullPage="true"> layout
	 * 	<p:layoutUnit position="north" header =""> parte de cima do layout com nome = header
	 * 		<h1>Topo</h1>
	 * 	</p:layoutUnit>
	 * 	<p:layoutUnit position="west" header ="" resizable="" collapsible="" size = ""> parte oeste do layout podemos redimenciar = resizable , podemos esconder = collapsible
	 * 		<h:form>
	 * 			<p:menu style ="width:100%"> menu com tamanho completo do formulario
	 * 				<p:menuitem value=""/> item do menu
	 * 			</p:menu>
	 * 		</h:form
	 * 	</p:layoutUnit>
	 * 	<p:layoutUnit position="center" header =""> parte do meio do layout
	 * 		<h:form>
	 * 			<p:editor/> cria um editor de texto
	 * 		</h:form>
	 * 	</p:layoutUnit>
	 * </layout>
	 * -----------------------------------------------------------------------------------------
	 * 
	 * Select on menu ou combobox
	 * <h:form>
	 * 	<p:panelGrid columns = "2">
	 *   <h:outputText value = ""/>
	 *   <p:selectOneMenu value=""> menu de seleção e onde será atribuido ex {bean.pessoa.nome}
	 *    <f:selectItem itemLabel = "" itemValue= ""/> item selecionado , itemLabel = valor da label, itemValue= oque sera mandado pro banco forma estatica
     *    <f:selectItems value="" var="" itemValue = "" itemLabel=""/>forma dinamica irá pegar uma lista passada no value e atribuir os valores da lista a variavel var
	 *   </p:selectOneMenu>
	 *  </p:panelGrid>
	 * </h:form>
	 * ------------------------------------------------------------------------------------------
	 * SelectOneRadio e renderização com ajax
	 * <h:form>
	 * 	<p:panelGrid columns = "2">
	 *   <p:selectOneRadio value = ""> select radio value é para quem irá o valor ex bean.pessoa.sexo
	 *    <f:selectItem itemLabel = "" itemValue=""/> item do radio itemLabel é oque aparece e itemValue o que é enviado
	 *    <p:ajax event="click" update="input" process="@this"/> ajax que ira fazer um evento ao clicar processando o proprio elemento marcado e enviar para o update
	 *   </p:selectOneRadio>
	 *   <h:panelGroup id="input"> panel de campos
	 *    <p:inputMask mask ="" value = "" id = "" rendered="#bean.sexo eq 'M'" required=""/> campo com mascara com value= value id = id redered significa que se o bean.sexo for = 'M' esse campo será renderizado required é se é necessário ou n
     *   </h:panelGroup>
	 *  </p:panelGrid>
	 * </h:form>
	 * 
	 * ---------------------------------------------------------------------------------------
	 * SelectManyCheckbox
	 * 
	 * 	<h:form id="form">
	 * 		<p:panelGrid columns = "2">
	 * 			<p:selectManyCheckbox value ="" layout="pageDirection"> uma caixa de seleção que será enviada para value caso queira deixar na vertical colcar esse layout caso queira na horizontal n precisa botar
	 * 				<p:selectItem itemLabel = "" itemValue = ""/>
	 * 			</p:selectManyCheckbox>
	 * 		</p:panelGrid>
	 *  </h:form>
	 *  
	 *  ---------------------------------------------------------------------------------------
	 *  
	 *  Mensagem de erro
	 *  
	 *  Nas mensagens de erro na classe bean CDI podemos criar uma mensagem de erro ou sucesso, por boas praticas ela deve ser colocada
	 *  no seu try/cattch e sempre no final dos trechos de códigos os metodos de mensagens são
	 *  
	 *  Sucesso
	 *  FaceMessage messa = new FaceMessage("mensagem de sucesso");
	 *  FacesContext.getCurrentInstance().addMessage(null,message);
	 *  
	 *  Erro
	 *  FaceMessage messa = new FaceMessage(FacesMessage.SEVERITY_ERROR,"mensagem de sucesso"); muda pouca coisa a diferença é que recebe 1 parametro a mais que signifa qual tipo de erro
	 *  FacesContext.getCurrentInstance().addMessage(null,message);
	 *  
	 *  E no no jsf você chama o metodo da classe normal ex
	 *  
	 *  <p:messages autoUpdate = "true"/> aqui a mensage aparecerá como texto
	 *  <p:growl autoUpdate="true" life=""> aqui a mensagem aparecerá em uma janelinha e com tempo = life em milisegundos
	 *  
	 *  <p:commandButton value="Mensage" action="#{bean.salvar}> e dentro do metodo salvar ter os metodos de mensagem
	 *  
	 *  -----------------------------------------------------------------------------------------------------------
	 *  sistema de Grid
	 *  
	 *  <p:panelGrid columns="2" layout="grid"
	 *  	styleClass="ui-fluid" style="margin-top:120px"
	 *  	columnClasses="ui-grid-col-1,ui-grid-col-3,
	 *  					ui-grid-col-1,ui-grid-col-3,
	 *  					ui-grid-col-1,ui-grid-col-3"
	 *  as colunas da grid ocupam 12 campos , nessa caso dividi em 3 blocos e caada bloco ocupa 4 campos totalizando 12
	 *  	<p:outputLabel value="campo1"/> <p:inputText/>
	 *  	<p:outputLabel value="campo2"/> <p:inputText/>
	 *  	<p:outputLabel value="campo3"/> <p:inputText/>
	 *  	<p:outputLabel value="campo4"/> <p:inputText/>
	 *  	<p:outputLabel value="campo5"/> <p:inputText/>
	 *  	<p:outputLabel value="campo6"/> <p:inputText/>	
	 *  </p:panelgrid>
	 *  
	 *  -------------------------------------------------------------------------------------------------------------
	 *  TabView
	 *  
	 *  <p:tabView> Criando um guia com tabView( abas)
	 *  	<p:tab title=""> criandouma aba com titulo = title
	 *  		......	conteudo da tabView
	 *  	</p:tab>
	 *  </p:tabView>
	 *  
	 *  ---------------------------------------------------------------------------------
	 *  confirmDiaolg dialogo de confirmação
	 *  
	 *  <p:commandButton value="salvar" action="#{bean.salvar}">
	 *  	<p:confirm header="cabeçalho" message="tem certeza que deseja salvar?"/> mensagem que irá aparecer ao clicar no botão
	 *  </p:commandButton>
	 *  
	 *  <p:confirmDialog global="true"> caixa de confirmação
	 *  	<p:commandButton value="sim" styleClass"ui-confirmdialog-yes" icon ="ui-icon-check"/> nunca esquecer o style class pois ele que confirma ou nega a ação
	 *  	<p:commandButton value="não" styleClass"ui-confirmdialog-no" icon ="ui-icon-close"/>
	 *  </p:confirmDialog>
	 */
}
