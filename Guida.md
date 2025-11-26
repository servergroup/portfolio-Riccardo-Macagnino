📘 Guida alla visualizzazione del Portfolio
1. Avvio del backend Spring Boot
Per avviare correttamente l’applicazione Spring Boot è necessario configurare le credenziali di Postgres e MongoDB nel file application.properties.

properties
# ============================
# POSTGRES (locale)
# ============================
spring.datasource.url=jdbc:postgresql://localhost:5432/portfolio
spring.datasource.username=postgres
spring.datasource.password=Ricky
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# ============================
# MONGODB (locale)
# ============================
spring.data.mongodb.uri=mongodb://localhost:27017/portfolio

# ============================
# SERVER
# ============================
server.port=8089
👉 Nota: modificare username, password e il nome del database in base alla propria configurazione locale.

Avvio da terminale
Per avviare l’applicazione Spring Boot digitare:

bash
./mvnw spring-boot:run
2. Avvio dell’applicazione mobile (React Native / Expo)
L’applicazione si trova nella cartella portfolio-ricky.

Passaggi:
Installare Node.js (versione LTS consigliata).

Scaricare i moduli necessari:

bash
npm install
Avviare l’applicazione:

bash
npm start
Aprire l’app Expo Go su Android/iOS e scansionare il QR code per visualizzare l’app.

3. Struttura dell’app mobile
L’app è composta da diverse sezioni/tab:

Sezione “Me” → Presentazione personale.

Sezione “Profilo” → Certificazioni conseguite e contatti, con link GitHub all’esercitazione corrente.

Sezione “Microservizio” → Dimostrazione del microservizio integrato, utilizzabile direttamente dall’app.

4. Struttura del sito web
Il sito web è organizzato in più sezioni:

Home → Presentazione personale.

Certificazioni → Galleria fotografica delle certificazioni conseguite.

Contatti → Recapiti telefonici ed email utili per contattarmi.