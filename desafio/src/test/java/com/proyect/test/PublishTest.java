package com.proyect.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.proyect.dataprovider.DataProviders;
import com.proyect.page.PublishPage;

public class PublishTest extends Base{
	
  @Test(description="Publicar un articulo", dataProvider ="PublishData",  dataProviderClass=DataProviders.class)
  public void Publish(String Email,String Password,String Categoria,String Condicion,String Genero,String Talla,String Titulo,String Contenido,String Precio,String Imagen,String Region,String Comuna) {
	  
	  PublishPage publishPage = new PublishPage(driver);
	  SoftAssert softAssertion= new SoftAssert();
  
	  softAssertion.assertTrue(publishPage.login(Email, Password), "No Encuentra el Login");
	  softAssertion.assertTrue(publishPage.ingresarPublicar(), "No se pudo salir a la pagina home");
	  softAssertion.assertTrue(publishPage.selectCategory(Categoria), "No se pudo seleccionar la categoria");
	  softAssertion.assertTrue(publishPage.selectCondition(Condicion), "No se pudo seleccionar la condicion");
	  softAssertion.assertTrue(publishPage.selectGender(Genero), "No se pudo seleccionar el genero");
	  softAssertion.assertTrue(publishPage.selectSize(Talla), "No se pudo seleccionar el tamaño");
	  softAssertion.assertTrue(publishPage.titlePost(Titulo), "No se pudo colocar titulo a la publicacion");
	  softAssertion.assertTrue(publishPage.bodyPost(Contenido), "No se pudo introducir el cuerpo de la publicacion");
	  softAssertion.assertTrue(publishPage.pricePost(Precio), "No se pudo introducir el precio");
	  softAssertion.assertTrue(publishPage.uploadPhoto(Imagen), "No se pudo subir la imagen");
	  softAssertion.assertTrue(publishPage.selectRegion(Region), "No se pudo seleccionar la region");
	  softAssertion.assertTrue(publishPage.selectComune(Comuna), "No se pudo seleccionar la comuna");
	  softAssertion.assertTrue(publishPage.acceptConditions(), "No se pudo aceptar las condiciones");
	  softAssertion.assertTrue(publishPage.submitPost(), "No se pudo publicar el articulo");
	  softAssertion.assertAll();
	
  }
  

}
