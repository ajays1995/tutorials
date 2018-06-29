import { TestBed, inject } from '@angular/core/testing';

import { ContentfulserviceService } from './contentfulservice.service';

describe('ContentfulserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ContentfulserviceService]
    });
  });

  it('should be created', inject([ContentfulserviceService], (service: ContentfulserviceService) => {
    expect(service).toBeTruthy();
  }));
});
