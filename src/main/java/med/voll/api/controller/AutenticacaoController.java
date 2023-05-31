package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuario.DadosAuetenticacao;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.infra.security.TokenService;
import med.voll.api.infra.security.DadosTokenJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/login")
public class AutenticacaoController {
    // Apesar de ser uma classe do próprio Spring, ele não sabe injetá-la. Temos que "ensiná-lo".
    // Temos que fazer essa configuração criando um metodo na classe na classe SecurityConfigurations.
    @Autowired
    private AuthenticationManager maneger;
    @Autowired
    private TokenService tokenService;
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAuetenticacao dados) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = maneger.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario)authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }

}
