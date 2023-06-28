package com.example.picture_day.config;

import com.example.picture_day.model.Comment;
import com.example.picture_day.model.Picture;
import com.example.picture_day.repository.repository.CommentRepository;
import com.example.picture_day.repository.repository.PictureRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.picture_day")
public class AppConfig implements WebMvcConfigurer, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/view/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

//    @Bean
//    public SessionFactory getSessionFactory() {
//        return new org.hibernate.cfg.Configuration().configure("hibernate.conf.xml").buildSessionFactory();
//    }
//
//    @Bean
//    public EntityManager entityManager() {
//        return getSessionFactory().createEntityManager();
//    }

    @Bean
    public CommentRepository commentRepository() {
        return new CommentRepository() {
            @Override
            public List<Comment> findAll() {
                return null;
            }

            @Override
            public List<Comment> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Comment> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public List<Comment> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Comment entity) {

            }

            @Override
            public void deleteAll(Iterable<? extends Comment> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Comment> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Comment> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Comment> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<Comment> entities) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Comment getOne(Integer integer) {
                return null;
            }

            @Override
            public <S extends Comment> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Comment> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Comment> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Comment> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Comment> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Comment> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public void updateLike(Integer c) {

            }
        };
    }

    @Bean
    public PictureRepository pictureRepository() {
        return new PictureRepository() {
            @Override
            public List<Picture> findAll() {
                return null;
            }

            @Override
            public List<Picture> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Picture> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public List<Picture> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Picture entity) {

            }

            @Override
            public void deleteAll(Iterable<? extends Picture> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Picture> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Picture> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Picture> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Picture> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public void deleteInBatch(Iterable<Picture> entities) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Picture getOne(Integer integer) {
                return null;
            }

            @Override
            public <S extends Picture> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Picture> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Picture> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Picture> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Picture> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Picture> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public Optional<Picture> findPictureByDisplayDate(LocalDate date) {
                return Optional.empty();
            }

            @Override
            public Optional<Picture> find(LocalDate toLocalDate) {
                return Optional.empty();
            }
        };
    }
}
