package com.example.demo.controller;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class CarrinhoController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/carrinho")
    public String carrinho(Model model) {
        // Lógica para a página do carrinho
        return "carrinho";
    }

    @PostMapping("/adicionar-usuario")
    public String adicionarUsuario(@RequestParam("nome") String nome,
                                   @RequestParam("cpf") String cpf,
                                   @RequestParam("email") String email,
                                   @RequestParam("endereco") String endereco,
                                   Model model) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setEndereco(endereco);

        usuarioRepository.save(usuario);

        // Lógica para o que acontece após adicionar o usuário (por exemplo, redirecionar para outra página)
        return "redirect:/carrinho";
    }
}
