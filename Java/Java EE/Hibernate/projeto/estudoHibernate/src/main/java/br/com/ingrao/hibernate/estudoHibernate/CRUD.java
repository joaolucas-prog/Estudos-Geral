package br.com.ingrao.hibernate.estudoHibernate;

public class CRUD {
 /*
  * Métodos uteis para fazer o crud
  * 
  * session.save(Objetct) insere o objeto 
  * session.get(Object.class,objectId) busca o objeto
  * session.remove(Object) remove o objeto
  * session.update(Objetct) atualiza os dados do objeto no banco , mesmo que não tenha mudança // bom para transformar datached->persist
  * 
  * podemos alterar isso fazendo com que o hibernate faça um select e verifique se existe alguma mudança
  * para isso você terá que importar a Entity do hibernate e passar uma propriedade chamada
  * SelectBeforeUpdate = "true" mas só faça isso se for realmente necessário , pois se você sabe que o objeto
  * não mudou o hibernate irá fazer umq query a mais atrapalhando o desempenho do banco
  * 
  * lembrando que a session precisa está com a trasaction iniciada
  * */
}
