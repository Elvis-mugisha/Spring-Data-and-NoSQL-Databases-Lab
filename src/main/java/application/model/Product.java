package application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Document(collection = "products") // Specifies the MongoDB collection
@RedisHash("Product") // Specifies Redis hash storage
@Data // Lombok annotation for getters, setters, toString, etc.
public class Product implements Serializable {

    @Id
    private String id;

    @Indexed // Indexed field in Redis for faster lookups
    private String name;

    private String description;
    private double price;


}
