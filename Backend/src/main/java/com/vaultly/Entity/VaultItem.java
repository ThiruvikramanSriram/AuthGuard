package com.Vaultly.Entity;

import com.Vaultly.Entity.VaultUsers.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

public class VaultItem {
	@Entity
	@Table(name = "vaultlyitems")
	public class VaultItems {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	    
	    @JoinColumn(name = "title")
	    private String title;
	    
	    @Column(name="encrypted_data")
	    private String encryptedData; // Encrypted password/note

	    //constructors
		public VaultItems(Long id, User user, String title, String encryptedData) {
			super();
			this.id = id;
			this.user = user;
			this.title = title;
			this.encryptedData = encryptedData;
		}
		
		// Getters and Setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getEncryptedData() {
			return encryptedData;
		}

		public void setEncryptedData(String encryptedData) {
			this.encryptedData = encryptedData;
		}
		
		//to string function
		@Override
		public String toString() {
			return "VaultItems [id=" + id + ", user=" + user + ", title=" + title + ", encryptedData=" + encryptedData
					+ "]";
		}    
	}
}
