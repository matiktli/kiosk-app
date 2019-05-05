## How to run:

###### (TMP until figure out Orcale Database)
1. Create mysql database: **kiosk_db**
2. Create mysql user([guide](https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql)): **kioskdb_admin**, with password: **password**
###### (TMP --end)

3. Get [JAR](https://drive.google.com/open?id=1F75bQUBOVyCNnE-LSvC1Foruh4rLibxh)
4. Run: `java -Dspring.profiles.active=local -jar JAR_NAME_HERE.jar`
5. Swagger under: [http://localhost:5000/swagger-ui.html](http://localhost:5000/swagger-ui.html)
