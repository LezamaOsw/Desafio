package com.proyect.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.proyect.dataprovider.DataProviderRegister;
import com.proyect.page.RegisterPage;

public class RegisterTest extends Base{	
  
  @Test(description="Registrar un usuario", dataProvider ="RegisterData",  dataProviderClass=DataProviderRegister.class)
  public void publishTest(String Nombre,String Region,String Comuna,String Numero_Telefono,String Email,String Password,String Verificacion) {
	  
	  RegisterPage registerPage = new RegisterPage(driver);
	  SoftAssert softAssertion= new SoftAssert();
  
	  softAssertion.assertTrue(registerPage.login(), "No Encuentra el Login");
	  softAssertion.assertTrue(registerPage.signupForm(), "No Encuentra Formulario de registro");
	  softAssertion.assertTrue(registerPage.userType(), "No se llena tipo de usuario");
	  softAssertion.assertTrue(registerPage.userName(Nombre), "No se llena nombre del usuario ");
	  softAssertion.assertTrue(registerPage.userGender(), "No se selecciona genero del usuario");
	  softAssertion.assertTrue(registerPage.selectRegion(Region), "No se selecciona la region");
	  softAssertion.assertTrue(registerPage.selectComune(Comuna), "No se selecciona la comuna");
	  softAssertion.assertTrue(registerPage.typePhone(), "No selecciona el tipo de numero de telefono");
	  softAssertion.assertTrue(registerPage.phoneNumber(Numero_Telefono), "No se llena el telefono del usuario");
	  softAssertion.assertTrue(registerPage.emailAddress(Email), "No se llena el correo del usuario");
	  softAssertion.assertTrue(registerPage.userPassword(Password), "No se llena la contraseña del usuario");
	  softAssertion.assertTrue(registerPage.verifyPassword(Verificacion), "No se confirma la contraseña del usuario");
	  softAssertion.assertTrue(registerPage.acceptConditions(), "No se aceptan las condiciones");
	  softAssertion.assertTrue(registerPage.submitRegister(), "No se envia el formulario de registro");
	  softAssertion.assertTrue(registerPage.registerConfirmation(), "No se puede confirmar el registro");
	 
	  softAssertion.assertAll();
	
  }
  
}
