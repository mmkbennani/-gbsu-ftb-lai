import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { GbsuFtbLaiFormComponent } from './gbsu-ftb-lai-form/gbsu-ftb-lai-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GbsuFtbLaiComponent } from './gbsu-ftb-lai/gbsu-ftb-lai.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { FrontEndInstructionComponent } from './front-end-instruction/front-end-instruction.component';
import { BackEndInstructionComponent } from './back-end-instruction/back-end-instruction.component';
import {MatButtonModule} from '@angular/material/button';

@NgModule({
  declarations: [
    AppComponent,
    GbsuFtbLaiFormComponent,
    GbsuFtbLaiComponent,
    HomeComponent,
    NavBarComponent,
    FrontEndInstructionComponent,
    BackEndInstructionComponent
  ],
  imports: [
    BrowserModule, ReactiveFormsModule, HttpClientModule, FormsModule, MatButtonModule, 
    RouterModule.forRoot([
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', component: HomeComponent },
      { path: 'gbsu-ftb-lai', component: GbsuFtbLaiComponent }
    ])
  ],
  providers: [
    { provide: 'SERVER_URL', useValue: 'http://localhost:8080' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
