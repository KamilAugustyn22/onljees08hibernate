package pl.coderslab;

import org.springframework.stereotype.Controller;

@Controller
public class PublisherController {
    private final PublisherDao publisherDao;

    public PublisherController(PublisherDao publisherDao) {
        this.publisherDao = publisherDao;
    }
    public void create(Publisher publisher){
        publisherDao.save(publisher);
    }
    public Publisher read(Publisher publisher){
        return publisherDao.findById(publisher.getId());
    }
    public void update(Publisher publisher){
        publisherDao.update(publisher);
    }
    public void delete(Publisher publisher){
        publisherDao.delete(publisher);
    }
}
