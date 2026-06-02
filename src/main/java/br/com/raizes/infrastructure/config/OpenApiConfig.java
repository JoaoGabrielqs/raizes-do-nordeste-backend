package br.com.raizes.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(
                        new Info()
                                .title("API - Rede Raízes do Nordeste")
                                .version("1.0")
                                .description(
                                        "Sistema Back-End para gerenciamento de pedidos multicanal, estoque, fidelidade e pagamento mock."
                                )
                );
    }
}