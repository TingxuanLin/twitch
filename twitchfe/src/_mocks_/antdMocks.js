// src/__mocks__/antdMocks.js
// Mock specific behavior of Ant Design's responsive observer

// Mock for window.matchMedia with better addListener implementation
window.matchMedia = jest.fn().mockImplementation((query) => ({
  matches: false,
  media: query,
  onchange: null,
  // These are the important ones - implement them as proper functions
  addListener: function (listener) {
    this.listener = listener;
  },
  removeListener: function (listener) {
    this.listener = null;
  },
  addEventListener: jest.fn(),
  removeEventListener: jest.fn(),
  dispatchEvent: jest.fn(),
}));

// Mock for ResizeObserver
global.ResizeObserver = class ResizeObserver {
  constructor(callback) {
    this.callback = callback;
  }
  observe() {}
  unobserve() {}
  disconnect() {}
};

// Mock for specific Ant Design behavior
jest.mock("antd/lib/_util/responsiveObserve", () => {
  const responsiveMap = {
    xs: "(max-width: 575px)",
    sm: "(min-width: 576px)",
    md: "(min-width: 768px)",
    lg: "(min-width: 992px)",
    xl: "(min-width: 1200px)",
    xxl: "(min-width: 1600px)",
  };

  let subscribers = [];
  let subUid = -1;
  let screens = {};

  return {
    responsiveMap,
    responsiveArray: ["xxl", "xl", "lg", "md", "sm", "xs"],
    subscribe(func) {
      if (subscribers.length === 0) {
        // First subscriber triggers a calculation
        for (const screen in responsiveMap) {
          screens[screen] = true; // Just make them all true for testing
        }
      }

      const token = (++subUid).toString();
      subscribers.push({ token, func });
      func(screens);
      return token;
    },
    unsubscribe(token) {
      subscribers = subscribers.filter((item) => item.token !== token);
    },
    // Add any other methods used by Ant Design
    register: () => {},
  };
});
