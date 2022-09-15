package com.uniam;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uniam.entity.Answer;
import com.uniam.entity.Question;
import com.uniam.repo.Answerrepo;
import com.uniam.repo.QuestionRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		QuestionRepo queImpl = ctx.getBean(QuestionRepo.class);
		Answerrepo Anstmpl = ctx.getBean(Answerrepo.class);
		
		Answer ans = new Answer();
		ans.setAnswerName("Java is A programming Language");
		ans.setPostedBy("aayam");
		
		Answer ans1 = new Answer();
		ans1.setAnswerName("Java is A platform");
		ans1.setPostedBy("uniq");
		
		ArrayList <Answer> al = new ArrayList<>();
		
		al.add(ans);
		al.add(ans1);
		
		
		Question question = new Question();
		question.setQname("What is Java");
		question.setAnswers(al);
		
		queImpl.save(question);
		
				
	}

}
