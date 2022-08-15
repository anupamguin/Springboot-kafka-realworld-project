package javaguides.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Value("${anupam.kafka.topics}")
	private String KAFKA_TOPICS;

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name(KAFKA_TOPICS).build();
	}
}
