import "@testing-library/jest-dom";
import "./__mocks__/antdMocks"; // Import our custom Ant Design mocks

// Mock window.matchMedia
window.matchMedia = (query) => ({
  matches: false,
  media: query,
  onchange: null,
  addListener: jest.fn(), // Deprecated but still used
  removeListener: jest.fn(), // Deprecated but still used
  addEventListener: jest.fn(),
  removeEventListener: jest.fn(),
  dispatchEvent: jest.fn(),
});

// Mock ResizeObserver (used by some Ant Design components)
global.ResizeObserver = class ResizeObserver {
  constructor(callback) {
    this.callback = callback;
  }
  observe() {}
  unobserve() {}
  disconnect() {}
};

// Suppress React 18 warnings during tests
const originalError = console.error;
console.error = (...args) => {
  // Suppress specific warnings that are not relevant to tests
  if (
    args[0]?.includes(
      "Warning: ReactDOM.render is no longer supported in React 18"
    ) ||
    args[0]?.includes("Warning: [antd:") ||
    args[0]?.includes("Warning: `ReactDOMTestUtils.act`")
  ) {
    return;
  }
  originalError(...args);
};
