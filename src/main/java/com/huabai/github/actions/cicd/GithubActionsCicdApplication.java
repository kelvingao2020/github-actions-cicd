package com.huabai.github.actions.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to github actions cicd!";
	}

//	echo "# github-actions-cicd" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M master
//	git remote add origin https://github.com/kelvingao2020/github-actions-cicd.git
//	git push -u origin master

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}

}
