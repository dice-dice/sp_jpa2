package com.example.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

//コンストラクタインジェクションの省略
@RequiredArgsConstructor
//コンポーネントであることを明示
@Component
//ApplicationRunner->実装したクラスに初期処理を実行させる
public class DataLoader implements ApplicationRunner {
	public final CommentRepository repository;
	
@Override
	public void run(ApplicationArguments args) throws Exception {
		var comment = new Comment();
		comment.setContent("こんにちは");
		repository.save(comment);
		
		var testComment = new Comment();
		testComment.setContent("テストコメント");
		repository.save(testComment);
		
}
}
