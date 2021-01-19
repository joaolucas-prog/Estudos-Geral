package br.com.ingrao.hibernate.estudoHibernate;

public class CRUD {
 /*
  * M�todos uteis para fazer o crud
  * 
  * session.save(Objetct) insere o objeto 
  * session.get(Object.class,objectId) busca o objeto
  * session.remove(Object) remove o objeto
  * session.update(Objetct) atualiza os dados do objeto no banco , mesmo que n�o tenha mudan�a // bom para transformar datached->persist
  * 
  * podemos alterar isso fazendo com que o hibernate fa�a um select e verifique se existe alguma mudan�a
  * para isso voc� ter� que importar a Entity do hibernate e passar uma propriedade chamada
  * SelectBeforeUpdate = "true" mas s� fa�a isso se for realmente necess�rio , pois se voc� sabe que o objeto
  * n�o mudou o hibernate ir� fazer umq query a mais atrapalhando o desempenho do banco
  * 
  * lembrando que a session precisa est� com a trasaction iniciada
  * */
}
