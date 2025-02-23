import { Component } from '@angular/core';

@Component({
  selector: 'app-twofa',
  standalone: false,
  templateUrl: './twofa.component.html',
  styleUrl: './twofa.component.css'
})
export class TwofaComponent {
  twoFAList = [
    { id: 1, service: "Google", secret: "********", decrypted: "G00GL3S3CR3T" },
    { id: 2, service: "GitHub", secret: "********", decrypted: "G1THUBS3CR3T" }
  ];

  masterPassword: string = '';
  showDecrypted: boolean = false;

  validateMasterPassword() {
    if (this.masterPassword === "admin123") {
      this.showDecrypted = true;
    } else {
      alert("Incorrect Master Password!");
    }
  }
}
