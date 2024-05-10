package tests.javafuzzer2128;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:13:09 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-24247L;
    public static int iFld=42;
    public float fFld=-36.573F;
    public static double dFld=-1.18166;
    public static volatile short sFld=-17601;
    public static volatile short sFld1=8385;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 61);
        FuzzerUtils.init(Test.lArrFld, 4033L);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(short s) {

        long l1=-1159057596L;

        l1 -= Test.iFld;
        vMeth_check_sum += s + l1;
    }

    public static long lMeth(long l, int i9, int i10) {

        int i11=-13, i12=-94, i13=0, i14=-53847, i15=2, i16=-11;
        boolean b=false;

        for (i11 = 340; i11 > 16; i11 -= 2) {
            for (i13 = 1; i13 < 10; i13++) {
                vMeth(Test.sFld);
                i10 -= i13;
                for (i15 = 1; i15 < 2; ++i15) {
                    if (true) break;
                    if (b) {
                        switch ((i11 % 3) + 119) {
                        case 119:
                            Test.iArrFld[i13 + 1] = -28402;
                            break;
                        case 120:
                            l = l;
                            Test.dFld += Test.iFld;
                            Test.iArrFld[i13 + 1] -= -21186;
                            break;
                        case 121:
                        default:
                            Test.dFld = i16;
                            i16 += i16;
                            if (i15 != 0) {
                            }
                        }
                    } else if (b) {
                        Test.lArrFld[i11 - 1] -= i16;
                    } else {
                        Test.instanceCount += (i15 * i15);
                    }
                }
            }
        }
        long meth_res = l + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + (b ? 1 : 0);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(float f, int i4) {

        int i5=13, i6=53141, i7=5, i8=45, i17=-156, i18=0, iArr1[]=new int[N];
        byte by1=86;

        FuzzerUtils.init(iArr1, -35443);

        for (i5 = 20; i5 < 323; i5++) {
            for (i7 = i5; i7 < 5; ++i7) {
                i8 += (i7 * i7);
                i4 += i7;
                Test.sFld += (short)i7;
                iArr1[i7] *= Test.iFld;
                i4 += (((i7 * f) + Test.iFld) - i5);
                Test.instanceCount += Test.iFld;
                Test.iFld = (int)(i8 += (int)((i6 + Test.instanceCount) + (-by1)));
                Test.instanceCount = iArr1[i7 + 1];
                i8 = (int)(iArr1[i5] += (int)(19.50644 - (Test.instanceCount + i6)));
            }
            i6 = (int)lMeth(Test.instanceCount, 15258, i6);
        }
        for (i17 = 14; i17 < 264; i17 += 3) {
            Test.iFld += i18;
        }
        i8 = (int)Test.instanceCount;
        long meth_res = Float.floatToIntBits(f) + i4 + i5 + i6 + i7 + i8 + by1 + i17 + i18 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=2, i1=-12, i2=123, i3=-30998, i19=-9, i20=11, i21=15723, iArr[]=new int[N];
        byte by=93;
        float f1=-2.438F, fArr[]=new float[N];
        boolean b2=false;
        long lArr[]=new long[N];
        short sArr[]=new short[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 128);
        FuzzerUtils.init(lArr, -88L);
        FuzzerUtils.init(sArr, (short)-22595);
        FuzzerUtils.init(fArr, 106.828F);
        FuzzerUtils.init(dArr, -87.2345);

        Test.iFld = (int)fFld;
        for (i = 218; i > 5; i--) {
            Test.iFld = (int)(-((Test.dFld + by) + i));
            Test.dFld = (-80L - (i + (-(++Test.dFld))));
            Test.iFld += (i + Test.iFld);
            for (i2 = 1; i2 < 118; i2 += 2) {
                boolean b1=true;
                try {
                    iArr[i - 1] = (i % Test.iFld);
                    Test.iFld = (i % 1979);
                    Test.iFld = (142 / i);
                } catch (ArithmeticException a_e) {}
                lArr[i2 - 1] += lArr[i - 1];
                i1 += iMeth(f1, i3);
                for (i19 = 3; 1 < i19; i19 -= 2) {
                    Test.iFld <<= i2;
                    i1 = (int)Test.instanceCount;
                    sArr[i + 1] >>= (short)Test.instanceCount;
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[i] >>>= Test.iFld;
                    i20 -= (int)Test.dFld;
                    Test.iFld = i3;
                    Test.instanceCount += i19;
                    iArr[i] = i;
                }
                switch (i + 110) {
                case 110:
                    if (b1) continue;
                    i21 = 1;
                    do {
                        i3 += 7;
                        i3 += (int)18563L;
                        Test.instanceCount += i1;
                        i3 -= (int)Test.dFld;
                        Test.instanceCount = i20;
                        Test.instanceCount += (i21 + i3);
                        Test.iFld += (i21 | i2);
                        i1 %= (int)8L;
                    } while (++i21 < 3);
                    break;
                case 111:
                    Test.iFld += (int)1.67971;
                    break;
                case 112:
                    Test.iFld *= i1;
                    break;
                case 113:
                    Test.iFld = 125;
                    break;
                case 114:
                    iArr = iArr;
                    break;
                case 115:
                    Test.iFld = -11;
                    break;
                case 116:
                    Test.instanceCount >>= 130;
                    break;
                case 117:
                    by = (byte)i19;
                case 118:
                case 119:
                    iArr[(9 >>> 1) % N] = i2;
                    break;
                case 120:
                    if (b1) break;
                    break;
                case 121:
                    Test.iFld -= -42909;
                    break;
                case 122:
                    fArr[i] -= i1;
                    break;
                case 123:
                    iArr[i] ^= i1;
                    break;
                case 124:
                    b1 = b1;
                    break;
                case 125:
                    Test.dFld = i20;
                    break;
                case 126:
                case 127:
                    Test.instanceCount = (long)Test.dFld;
                    break;
                case 128:
                    f1 = by;
                    break;
                case 129:
                    if (true) break;
                    break;
                case 130:
                    Test.sFld >>= (short)i20;
                    break;
                case 131:
                    i3 >>= -56635;
                case 132:
                case 133:
                    i20 = Test.sFld;
                    break;
                case 134:
                    i20 >>= (int)Test.instanceCount;
                    break;
                case 135:
                case 136:
                    b1 = false;
                case 137:
                case 138:
                    fArr[i] = Test.instanceCount;
                case 139:
                    if (b2) continue;
                    break;
                case 140:
                    i20 += (i2 ^ i19);
                case 141:
                    if (b2) continue;
                case 142:
                    lArr[i2 + 1] |= i21;
                    break;
                case 143:
                    iArr = FuzzerUtils.int1array(N, (int)7);
                    break;
                case 144:
                    Test.dFld += Test.instanceCount;
                    break;
                case 145:
                    Test.dFld += -42;
                    break;
                case 146:
                    Test.iFld += (i2 | i20);
                    break;
                case 147:
                    i1 /= (int)(i19 | 1);
                    break;
                case 148:
                    i3 *= (int)Test.dFld;
                    break;
                case 149:
                    i20 = i3;
                    break;
                case 150:
                    iArr[i2] >>= (int)Test.instanceCount;
                    break;
                case 151:
                    fFld -= i3;
                case 152:
                    i20 |= i1;
                    break;
                case 153:
                    Test.instanceCount -= i21;
                    break;
                case 154:
                    i1 >>>= 127;
                case 155:
                    i3 *= Test.sFld1;
                    break;
                case 156:
                    i20 += (((i2 * i21) + i20) - fFld);
                    break;
                case 157:
                case 158:
                    Test.iFld = i1;
                case 159:
                    i3 += by;
                    break;
                case 160:
                    i1 -= -50135;
                    break;
                case 161:
                    Test.iFld += (i2 | i2);
                    break;
                case 162:
                    b1 = b1;
                    break;
                case 163:
                    dArr = dArr;
                case 164:
                    Test.sFld += (short)41364;
                    break;
                case 165:
                    Test.iFld = by;
                    break;
                case 166:
                    Test.dFld += i3;
                    break;
                case 167:
                    iArr[i] += Test.sFld;
                    break;
                case 168:
                case 169:
                    i3 += i2;
                    break;
                case 170:
                    i1 = i1;
                    break;
                case 171:
                    i20 *= Test.iFld;
                    break;
                case 172:
                    Test.instanceCount += (i2 * i2);
                    break;
                case 173:
                    try {
                        i1 = (17274 / i2);
                        iArr[(Test.iFld >>> 1) % N] = (i3 / i19);
                        Test.iFld = (220 / i20);
                    } catch (ArithmeticException a_e) {}
                case 174:
                    Test.instanceCount = -3411911647L;
                    break;
                case 175:
                    Test.iFld >>= (int)Test.instanceCount;
                case 176:
                    i3 += i1;
                    break;
                case 177:
                    Test.sFld += (short)(i2 | Test.instanceCount);
                case 178:
                    i20 = (int)Test.instanceCount;
                    break;
                case 179:
                    i1 |= i21;
                    break;
                }
            }
        }

    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}