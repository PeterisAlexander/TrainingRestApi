package com.training.myrestapi.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.training.myrestapi.entities.UserEntity;
//import com.training.myrestapi.repository.UserRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         //Check si le user existe en bd
//        UserEntity user = userRepository.findByUsername(username);
//
//        if(user == null) {
//            throw new UsernameNotFoundException("No user named " + username);
//        } else {
//            return new UserDetailsImpl(user);
//        }
//    }
//}
