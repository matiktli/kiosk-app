
## How to run:

###### (TMP until figure out Orcale Database)
1. Create mysql database: **kiosk_db**
2. Create mysql user([guide](https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql)): **kioskdb_admin**, with password: **password**
###### (TMP --end)

3. Get [JAR](https://drive.google.com/open?id=1F75bQUBOVyCNnE-LSvC1Foruh4rLibxh)
4. Run: `java -Dspring.profiles.active=local -jar kioskapp-0.1.0_MVP_.jar`