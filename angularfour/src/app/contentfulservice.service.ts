import { Injectable } from '@angular/core';
import { createClient, Entry } from 'contentful';

@Injectable()
export class ContentfulserviceService {


  private contentfulClient = createClient(
    {
      space:'w3necd0jwqok',
      accessToken:'8861441da57fa5e1680db16c132ed0b1fdfaf2d51c4a91104fe527e31942f7a1'
    }
  );

  constructor() { }

  getProducts() {
    return this.contentfulClient.getEntries(
      {
        content_type:'2PqfXUJwE8qSYKuM0U6w8M'
      }
    ).then(res=>res.items);
  }

}
