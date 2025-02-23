# VAULTY
<h1>Open-Source Secure Wallet Manager with in build 2FA</h1>

<h2>Overview</h2>
<p>This project is an open-source <strong>wallet manager</strong> that securely stores passwords, email IDs, and notes in an <strong>encrypted format</strong>. It also includes a built-in <strong>Two-Factor Authentication (2FA) generator</strong>, similar to Google Authenticator, allowing users to store and generate 2FA codes.</p>
<p>The application is designed to be <strong>simple, user-friendly, powerful, and highly secure</strong>.</p>

<h2>Features</h2>

<h3><strong>User Authentication</strong></h3>
<ul>
<li>Users can <strong>sign up, log in</strong>, and <strong>reset passwords</strong>.</li>
<li>Uses <strong>JWT authentication</strong> for secure login sessions.</li>
</ul>

<h3><strong>Secure Storage</strong></h3>
<ul>
<li>Users can store <strong>passwords, emails, and notes</strong> under categories like Work, Email, and Website.</li>
<li>All sensitive data is <strong>encrypted using AES-256</strong> before storage.</li>
<li>Uses <strong>bcrypt for password hashing</strong>.</li>
</ul>

<h3><strong>Two-Factor Authentication (2FA)</strong></h3>
<ul>
<li>Users can <strong>enable TOTP-based 2FA</strong> for added security.</li>
<li>Uses <strong>Speakeasy</strong> to generate <strong>TOTP codes</strong>.</li>
<li>Generates <strong>QR codes</strong> using <strong>QRCode.js</strong> for easy setup in authenticator apps.</li>
</ul>

<h3><strong>Data Syncing</strong></h3>
<ul>
<li>Allows <strong>syncing across multiple devices</strong> using <strong>Supabase</strong> with real-time updates.</li>
</ul>

<h3><strong>Encryption for Local Storage</strong></h3>
<ul>
<li>Uses <strong>LocalStorage / IndexedDB</strong> to store encrypted data when offline.</li>
</ul>

<hr>

<h2><strong>Tech Stack</strong></h2>

<h3><strong>Frontend:</strong></h3>
<ul>
<li><strong>Angular.js</strong> - For building the user interface.</li>
<li><strong>Bootstrap</strong> - For responsive design and UI components.</li>
<li><strong>Supabase</strong> - For authentication and database management (PostgreSQL).</li>
</ul>

<h3><strong>Backend:</strong></h3>
<ul>
<li><strong>Spring Boot (Java)</strong> - For backend logic and API endpoints.</li>
<li><strong>PostgreSQL</strong> (via Supabase) - For encrypted data storage.</li>
<li><strong>JWT (JSON Web Tokens)</strong> - For session management and authentication.</li>
</ul>

<h3><strong>Security:</strong></h3>
<ul>
<li><strong>AES-256 encryption</strong> - For encrypting sensitive stored data.</li>
<li><strong>bcrypt</strong> - For hashing user passwords securely.</li>
<li><strong>TOTP (Time-based One-Time Password)</strong> - For 2FA security.</li>
<li><strong>Speakeasy</strong> - For generating TOTP tokens.</li>
<li><strong>QRCode.js</strong> - For generating QR codes for 2FA setup.</li>
</ul>

<hr>

<h2><strong>Installation & Setup</strong></h2>

<h3><strong>Frontend Setup (Angular.js)</strong></h3>
<ol>
<li>Install Angular CLI if not installed:
   <pre><code>npm install -g @angular/cli</code></pre>
</li>
<li>Create the Angular project:
   <pre><code>ng new wallet-manager-app
cd wallet-manager-app</code></pre>
</li>
<li>Install dependencies:
   <pre><code>npm install bootstrap @supabase/supabase-js qrcode</code></pre>
</li>
<li>Configure <strong>Supabase authentication</strong> in the Angular service.</li>
<li>Implement UI components for <strong>login, signup, data storage, and 2FA setup</strong>.</li>
<li>Implement <strong>JWT authentication handling</strong>.</li>
</ol>

<h3><strong>Backend Setup (Spring Boot & PostgreSQL)</strong></h3>
<ol>
<li>Use <strong>Spring Initializr</strong> (<a href="https://start.spring.io/">start.spring.io</a>) to create a new Spring Boot project with dependencies:
   <ul>
   <li>Spring Web</li>
   <li>Spring Security</li>
   <li>Spring Data JPA</li>
   <li>PostgreSQL Driver</li>
   <li>JWT Authentication</li>
   </ul>
</li>
<li>Configure the <strong>PostgreSQL database</strong> in <code>application.properties</code>:
   <pre><code>spring.datasource.url=jdbc:postgresql://db_url:5432/database_name
spring.datasource.username=db_user
spring.datasource.password=db_password</code></pre>
</li>
<li>Implement <strong>JWT authentication</strong> in the backend.</li>
<li>Implement <strong>AES-256 encryption</strong> for storing passwords.</li>
<li>Use <strong>Speakeasy</strong> for TOTP-based 2FA.</li>
</ol>

<hr>

<h2><strong>API Endpoints</strong></h2>

<h3><strong>Authentication Endpoints</strong></h3>
<table>
<tr><th>Method</th><th>Endpoint</th><th>Description</th></tr>
<tr><td>POST</td><td><code>/api/auth/register</code></td><td>Registers a new user</td></tr>
<tr><td>POST</td><td><code>/api/auth/login</code></td><td>Logs in the user and issues JWT</td></tr>
<tr><td>POST</td><td><code>/api/auth/enable-2fa</code></td><td>Enables 2FA and provides a QR code</td></tr>
<tr><td>POST</td><td><code>/api/auth/verify-2fa</code></td><td>Verifies the TOTP code</td></tr>
</table>

<h3><strong>Data Storage Endpoints</strong></h3>
<table>
<tr><th>Method</th><th>Endpoint</th><th>Description</th></tr>
<tr><td>GET</td><td><code>/api/data/get</code></td><td>Retrieves stored passwords and notes</td></tr>
<tr><td>POST</td><td><code>/api/data/store</code></td><td>Encrypts and stores data</td></tr>
<tr><td>DELETE</td><td><code>/api/data/delete/:id</code></td><td>Deletes stored data</td></tr>
</table>

WORKS WE DONE AND NOT DONE

# 🚀 Vaultly Backend - Initial Setup  

## 📝 Overview  
Vaultly is an open-source secure vault manager designed for storing passwords, emails, and notes in an **encrypted format** with **2FA support**.  

This initial setup includes:  
✅ **Database Integration (MySQL)**  
✅ **User Authentication**  
✅ **Password Hashing (bcrypt)**  
✅ **AES-256 Encryption for Vault Items**  
✅ **JWT-Based Authentication**  
✅ **Basic User & VaultItem Models**  


## 📂 File Structure (Implemented Till Now)  
```plaintext
Vaultly/
│── src/
│   ├── main/
│   │   ├── java/com/vaultly/
│   │   │   ├── config/  
│   │   │   │   ├── SecurityConfig.java  # Spring Security Setup  
│   │   │   ├── controller/  
│   │   │   │   ├── AuthController.java  # Handles User Auth (JWT Login/Register)  
│   │   │   ├── model/  
│   │   │   │   ├── User.java  # User Entity  
│   │   │   │   ├── VaultItem.java  # Vault Entity  
│   │   │   ├── repository/  
│   │   │   │   ├── UserRepository.java  # JPA Repository for Users  
│   │   │   │   ├── VaultItemRepository.java  # JPA Repository for Vault Items  
│   │   │   ├── service/  
│   │   │   │   ├── JwtService.java  # JWT Token Generation & Validation  
│   │   │   │   ├── EncryptionService.java  # AES-256 Encryption & Decryption  
│   │   │   │   ├── AuthService.java  # User Auth Logic  
│   │   │   ├── VaultlyApplication.java  # Main Spring Boot App  
│   ├── resources/
│   │   ├── application.properties  # DB & Security Config  
│── pom.xml  # Project Dependencies  
│── README.md  # This File






<hr>

<h2><strong>License</strong></h2>
<p>This project is licensed under the <strong>MIT License</strong>.</p>

<hr>

<h2><strong>Contact</strong></h2>
<p>For queries or contributions, contact <strong>Thiruvikraman</strong> at <a href="mailto:thiruvikramansriram@gmail.com">thiruvikramansriram@gmail.com</a>
   <strong>Thiyanesh</strong> at <a href="mailto:thiyaneshr11b328@gmail.com">thiyaneshr11b328@gmail.com</a>
   <strong>KUMARA grur</strong> at <a href="mailto:kumaraguru4612@gmail.com">kumaraguru4612@gmail.com</a>.</p>

<h2><strong>Happy Coding! 🚀</strong></h2>


